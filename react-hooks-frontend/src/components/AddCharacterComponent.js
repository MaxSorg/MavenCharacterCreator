import React, {useState} from 'react'

const AddCharacterComponent = () => {

    const [pcharName, setpcharName] = useState('')
    /*const [they, setthey] = useState('')
    const [them, setthem] = useState('')
    const [playerRace, setplayerRace] = useState('')
    const [pClass, setpClass] = useState('')*/

    const saveCharacter = (e) => {
        e.preventDefault();

        const character = {pcharName}

        console.log(character);

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
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>
  )
}

export default AddCharacterComponent