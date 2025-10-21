import React, { Component } from 'react'

export class Classcomponent extends Component {
  //add state handling for this class component
  constructor() {
    super()
    this.state = { // state is an object
      name: 'priyanka',
      age: 24
    }
    this.changeName = this.changeName.bind(this) // bind the method to the class

  }
  render() {
    return (
      <div><label>Hi Vine from class Classcomponent</label></div>
    )
  }
}

export default Classcomponent

//class component vs functional component
//1.class component is stateful component but functional component is stateless component 
//2.class component is created using class keyword but functional component is created using function keyword 
//3.class component is created using extends Component but functional component is created using function keyword
//4.class component is created using render() method but functional component is created using return() method
//5.class component is created using this keyword but functional component is created without this keyword
//6.class component is created using constructor() method but functional component is created without constructor() method
//7.class component is created using super() method but functional component is created without super() method
//8.class component is created using state object but functional component is created using useState() hook