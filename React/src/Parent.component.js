import React, { Component } from 'react';
import ChildComponent from './Child.component.js';

class ParentComponent extends Component {
    state = {
        name: "dsa"
    };
    constructor() {
        super()
        this.handleClick=this.handleClick.bind(this);


    }
    handleClick() {

        setTimeout(function() {
            // this.name = "dds";
            this.setState({
             name: "Dhruthi"
         });
 
         }, 2000);

    }
    onUpdate= (data)=>{
        console.log("Data recieved from child is",data)
    }
//use handle =() => { } notation if not you have to bind
    render() {
        return (
            <div>
                <button onClick={this.handleClick}>Click</button>
                {
                    this.state.name && <span>Hello</span>
                }
                <ChildComponent name={this.state.name} onUpdate={this.onUpdate} />
            </div>
        );
        //return React.createElement("h1",null,this.props.name)
    }
}
export default ParentComponent