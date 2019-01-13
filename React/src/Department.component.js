import React,{Component} from 'react';
import AddDepartmentComponent from './Adddepartment.component';
import ListDepartmentComponent from './Listdepartment.component';
class Department extends Component{
    
    onDepartmentAdded = (newDepartmentData)=>{
        this.props.onDeptAdd(newDepartmentData)
    }
    render(){
        return(
            <React.Fragment>
                <AddDepartmentComponent onDeptAdd={this.onDepartmentAdded}>
                </AddDepartmentComponent>
                <ListDepartmentComponent departments={this.props.departments} employees={this.props.employees}>
                </ListDepartmentComponent>
            </React.Fragment>
        );
    }
}
export default Department;