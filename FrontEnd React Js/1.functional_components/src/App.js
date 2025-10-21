import './App.css';
import Child from './components/Child';
import Classcomponent from './components/Classcomponent';
import Parent from './components/Parent';


function App() {//root component
  return (
    <div className="App-header">
     <Parent/> 
    </div>
  );
}

export default App;
