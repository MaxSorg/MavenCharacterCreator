import axios from 'axios'

const CHARACTER_BASE_REST_API_URL = 'http://localhost:8080/api/v1/characters';

class CharacterService {

    getAllCharacters(){
        return axios.get(CHARACTER_BASE_REST_API_URL)
    }

    createCharacter(character) {
        return axios.post(CHARACTER_BASE_REST_API_URL, character)
    }

    deleteCharacter(pCharID) {
        return axios.delete(CHARACTER_BASE_REST_API_URL + '/' + pCharID);
    }
}

export default new CharacterService();