import React, {Component} from 'react';



export var ChildComponent = props =>{
    return(
        <div>
            <button onClick={()=>{props.onUpdate('Hello');}}>Send Data</button>
        </div>
    )
    //return React.createElement("div",null,props.name);
}
//const ChildComponent =props => {
 //   let localFn = () => {
   //     props.onUpdate("hello");
  //  };
   // return(
     //   <div>
       //     <button onClick={localFn}>Send Data</button>
       // </div>
    //);
//}

export default ChildComponent;