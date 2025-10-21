import { useEffect ,useRef,useState} from 'react';
import './App.css';
import Parent from './components/Parent';

function App() {

  const [input,setInput]=useState(0);

   useEffect(() => { 
    //LOGIOC EXECUTES ON MOUNT
    //we can make api call and get values
    console.log("logic executed from  useffect");
    return () => {console.log("App component unmounted")};//UNMOUNT
  },[input]); //on update

  const ref=useRef();


  return (
    <div className="App">
      <button onClick={()=>{setInput(1)}}>+</button>
      <Parent/>
    </div>
  );
}

export default App;
