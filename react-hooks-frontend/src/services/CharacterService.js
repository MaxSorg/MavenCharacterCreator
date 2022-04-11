import axios from 'axios'

const CHARACTER_BASE_REST_API_URL = 'http://localhost:8080/api/v1/characters';

class CharacterService {

    getAllCharacters(){
        return axios.get(CHARACTER_BASE_REST_API_URL)
    }
}

export default new CharacterService();