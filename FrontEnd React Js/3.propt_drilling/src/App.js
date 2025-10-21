import './App.css';
import  Parent from './components/Parent';
import {useState} from 'react';

function App() {
  const [name, setName] = useState("welcome Vine");
  const firstfunction = ()=> {
     console.log('calling function from root component');
  }
  return (
    <div className="App-header">
      <label>from root component {name}</label>
      <Parent name={name} setName={setName} firstfunction={firstfunction}/>  {/*hfghafdhadfhdf*/}
    </div>
  );
}

export default App;
