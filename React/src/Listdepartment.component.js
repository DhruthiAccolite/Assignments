import React,{Component} from 'react';
import { all } from 'q';
class ListDepartmentComponent extends Component{
    state={
        dep:"all"
    }
    handle = (d) => {
        this.setState({dep:d});
    }
    printer = (name,description) => {
        
    }
    render(){
       
        
        return(
            <div>
            <select id="dep" onChange={
                () => {
                    console.log("sdfdsf",document.getElementById("dep").value);
                    this.handle(document.getElementById("dep").value);
                    console.log(this.state.dep);
                }
            }><option value="all" >All</option>
               { this.props.departments &&
                this.props.departments.map((department,i)=>{
                   return( <option value={department.name}>{department.name}</option>
                    )
                })
            }
            </select>
           
        
        <table border="1" cellpading="1"><tbody>
            {
                this.props.employees &&
                this.props.employees.map((employee,i)=>{
                    if(this.state.dep=="all" || employee.department == this.state.dep){
                   return( <tr key={employee.name}>
                        <td>
                            {employee.name}
                        </td>
                        <td>
                            {employee.lname}
                        </td>
                        <td>
                            {employee.age}
                        </td>
                        <td>
                            {employee.designation}
                        </td>
                        <td>
                            {employee.location}
                        </td>
                        <td>
                            {employee.department}
                        </td>
                    </tr>
                    )}
                })
            }
            </tbody></table>
            
       
        </div>
        ) 
    }
}
export default ListDepartmentComponent;