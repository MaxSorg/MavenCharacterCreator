import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import CharacterService from '../services/CharacterService'

const ListCharactersComponent = () => {

    const [characters, setCharacters] = useState([])

    useEffect(() => {
        
        CharacterService.getAllCharacters().then((response) => {
            setCharacters(response.data)
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })

    }, [])

    return (
        <div className = "container">
            <h2> List Characters</h2>            
            <Link to = "/add-character" className = "btn btn-primary mb-2" > Add Character </Link>
            <table className="table table-bordered table-striped">
                <thead>
                    <th>Character ID </th>
                    <th>Name </th>
                    <th>Pronouns</th>
                    <th>Class</th>
                    <th>Race</th>
                </thead>
                <tbody>
                    {
                        characters.map(
                            characters =>
                            <tr key = {characters.pCharID}>
                                <td> {characters.pCharID} </td>
                                <td> {characters.pcharName} </td>
                                <td> {characters.they}/{characters.them} </td>
                                <td> {characters.pClass} </td>
                                <td> {characters.playerRace} </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
  )
}

export default ListCharactersComponent