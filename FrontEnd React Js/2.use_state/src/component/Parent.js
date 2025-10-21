import React from 'react'
import { useState } from 'react';

const Parent = () => {

      const [input,setInput]=useState();// useState is a function which returns an array of two elements 
  //first element is the current state value
  //second element is a function to update the state value
  const [secInput,setSecInput] =useState(); //state management is done by react 
  return (
    <div><form onSubmit={(e) => {e.preventDefault()}}>
        <label>enter value</label>
        <input type="text" value={input} onChange={(e)=>setInput(e.target.value)}/>
        <button onClick={e=>setSecInput(input)}>submit</button>
        <input type="text" value={secInput} />
      </form>
    </div>
  )
}

export default Parent