import React, { useState } from 'react'
import Child from './Child'

const Parent = ({name,setName,firstfunction}) => {
    const[input,setInput]=useState('Antony');
    return (
        <div>
                <label>from parent{name}</label>
                <Child name={name} setName={setName} input={input} setInput={setInput}  firstfunction={firstfunction}/>
                <button onClick={()=>{firstfunction()}}>parent submit</button>
        </div>
    )
}

export default Parent