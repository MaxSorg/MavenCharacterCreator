import './App.css';
import {
  BrowserRouter as Router, 
  Route, 
  Routes 
} from 'react-router-dom';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import ListCharactersComponent from './components/ListCharactersComponent';
import AddCharacterComponent from './components/AddCharacterComponent';
import ListRacesComponent from './components/ListRacesComponent';

function App() {
  return (
    <div>
      <Router>
      <HeaderComponent />
      <div className= "container">
        <Routes>          
          <Route exact path = "/" element = {<ListCharactersComponent />}></Route>
          <Route path = "/characters" element = {<ListCharactersComponent />}></Route>
          <Route path = "/add-character" element = {<AddCharacterComponent />}></Route>
          <Route path = "/races" element = {<ListRacesComponent />}></Route>
        </Routes>      
      </div> 
      <FooterComponent />
      </Router>
    </div>
  );
}

export default App;
