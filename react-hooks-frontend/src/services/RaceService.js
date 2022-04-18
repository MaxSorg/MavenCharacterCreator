import axios from 'axios'

const RACE_BASE_REST_API_URL = 'http://localhost:8080/api/v1/races';

class RaceService {

    getAllRaces() {
        return axios.get(RACE_BASE_REST_API_URL)
    }

}

export default new RaceService();