import './App.css';
import { useState } from 'react';
import Parent from './component/Parent';

function App() { //ES7 jsx snippet  //jsx = javascript + HTML
  //useState is a react hook
  return (
    <div className="App">
      <Parent/>
    </div>
  );
}

export default App;
