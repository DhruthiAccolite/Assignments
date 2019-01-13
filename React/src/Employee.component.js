import React,{Component} from 'react';
import AddComponent from './Add.component';
import ListComponent from './List.component';
class Employee extends Component{
    
    onEmployeeAdded = (newEmployeeData)=>{
        this.props.onEmpAdd(newEmployeeData)
    }
    render(){
        return(
            <React.Fragment>
                <AddComponent onEmpAdd={this.onEmployeeAdded} departments={this.props.departments}>
                </AddComponent>
                <ListComponent employees={this.props.employees}>
                </ListComponent>
            </React.Fragment>
        );
    }
}
export default Employee;