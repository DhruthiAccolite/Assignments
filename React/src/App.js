import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import  ParentComponent from './Parent.component.js';
class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

export class ComponentName extends Component{
  render(){
    return React.createElement('div',null,<ParentComponent/>)
  }
}

const FunctionasComponent = props => {
  return React.createElement(
    'div',
    null,
    React.createElement("span",null,props.name+props.lname));
}
//export default ComponentName;
export default ComponentName;
