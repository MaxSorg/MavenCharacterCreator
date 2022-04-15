import React, {useState} from 'react'
import {
    useNavigate,
    Link
} from 'react-router-dom';
import CharacterService from '../services/CharacterService';

const AddCharacterComponent = () => {

    const [pcharName, setpcharName] = useState('')
    /*const [they, setthey] = useState('')
    const [them, setthem] = useState('')
    const [playerRace, setplayerRace] = useState('')
    const [pClass, setpClass] = useState('')*/
    const history = useNavigate();


    const saveCharacter = (e) => {
        e.preventDefault();

        const character = {pcharName}

        CharacterService.createCharacter(character).then((response) => {

            console.log(response.data)

            history('/characters');

        }).catch(error => {
            console.log(error)
        })

    }
    return (
    <div>
        <br /> <br />
        <div className = "container">
            <div className = "row">
                <div className = "card col-md-6 offset-md-3 offset-md-3">
                    <h2 className = "text-center"> Add Character</h2>
                    <div className = "card-body">
                        <form>
                            <div className = "form-group mb-2">
                                <label className = "form-label"> Character Name :</label>
                                <input
                                    type = "text"
                                    placeholder = "Enter character name"
                                    name = "pcharName"
                                    className = "form-control"
                                    value = {pcharName}
                                    onChange = {(e) => setpcharName(e.target.value)}
                                >
                                </input>
                            </div>
                            <button className = "btn btn-success" onClick = {(e) => saveCharacter(e)}> Submit</button>
                            <Link to ="/characters" className = "btn btn-danger"> Cancel </Link>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>
  )
}

export default AddCharacterComponent