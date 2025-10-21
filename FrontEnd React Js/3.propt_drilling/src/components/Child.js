import React, { useState } from 'react'

const Child = ({name,setName,input,setInput,firstfunction}) => {

    return (
        <div>
            <label>from child{name}</label>
            <input type="text" placeholder="Enter your name" name={name} onChange={(e)=>setName(e.target.value)}/>
            <label>welcome {input}</label>
            <button onClick={()=>{firstfunction()}}>child submit</button>
        </div>
    );
};

export default Child