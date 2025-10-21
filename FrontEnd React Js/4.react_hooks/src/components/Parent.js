
import {useEffect, useRef,useState} from 'react'
import {useLocalStoarage} from './src/customhooks/useLocalStorage'

const Parent = () => {

useEffect(() => {
    const fetchvalues = async () => {
        const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
        const data = await response.json();
        console.log(data.data);

    };
    (()=>fetchvalues())();
}, []);

const [name, setName] = useState("");  
const inputRef = useRef(null);


        useLocalStoarage('vine','welcoime vine')

//const {id}=useParam();

return (
    <form onSubmit={(e)=>e.preventDefault()}>
        <label htmlFor="nameInput">Name:</label>
        <input id="nameInput" type="text" value={name} onChange={(e)=>setName(e.target.value)} ref={inputRef}/>
        <button onClick  ={() => {inputRef.current.focus();setName("")}}>button</button>
        <input type='text'/>
        <input type='text'/>
    </form>
);
}

export default Parent