
import './App.css';
import api from './api/post'
import {useEffect} from 'react'

function App() {
  useEffect(() => {
      const fetchvalues = async () => {
          const response = api.get();
          console.log(response);
  
      };
      (()=>fetchvalues())();
  }, []);
  return (
    <div className="App">
      <header className="App-header">
       
      </header>
    </div>
  );
}

export default App;
