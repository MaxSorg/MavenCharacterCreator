import React, { useEffect, useState } from 'react'
import RaceService from '../services/RaceService'


const ListRacesComponent = () => {

    const [races, setRaces] = useState([])

    useEffect(() => {
        
        getAllRaces();

    }, [])


    const getAllRaces = () =>{
        RaceService.getAllRaces().then((response) => {
            setRaces(response.data)
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    }

    return (
        <div className = "container">
            <h2>List of Races</h2>
            <table className= "table table-bordered">
                <thead>
                    <tr>
                        <th>Races</th>
                        <th>Strength</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        (Object.keys(races)).map (
                            key =>
                            <tr><td>{key}</td></tr>
                        )                          
                    }                               
                </tbody>  
            </table>
        </div>
    )
}

export default ListRacesComponent