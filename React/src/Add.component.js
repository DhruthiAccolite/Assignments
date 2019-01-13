import React,{Component} from 'react';
class AddComponent extends Component{
    data={}
    state = {
        show: false,
        errormsg:''
      };
   
    onClick = () => {
        this.setState({show:true});
    };
    onCancel = () => {
        this.setState({show:false});
    };
    handleChange = event => {
      
        this.data[event.target.id]=event.target.value;
    }
   validate = (data) => {
       if (data.age<18){
           this.setState({errormsg:"gyyugu"})
           return false;
       }
       return true;
   }
    add =(e) => {
        e.preventDefault();
        if (this.validate(this.data)){
        this.data["name"] && this.data["name"].length <20 && this.data.age>18 && this.data["age"] && this.props.onEmpAdd(this.data);
    }}
    render(){
        
        return(
        <div>
            <button  onClick={this.onClick}>Add Employees</button>
            <div>{this.state.errormsg}</div>
            {
                this.state.show && (
                    <div>
                        <form>
                            Name:<input type="text" id="name" onChange={this.handleChange} required/>
                            Last Name:<input type="text" id="lname" onChange={this.handleChange}/>
                            Age:<input type="text" id="age" onChange={this.handleChange} required/>
                            Designation:<input type="text" id="designation" onChange={this.handleChange}/>
                            Location:<input type="text" id="location" onChange={this.handleChange}/>
                            Department:<select id="department" onChange={this.handleChange}>
                            <option value="NA">NA</option>
                            {
                                this.props.departments &&
                                this.props.departments.map((department,i)=>{
                                   return( <option value={department.name}>{department.name}</option>
                                    )
                                })
                            }
                            </select>
                            <button onClick={this.add}>Add</button>
                            <button onClick={this.onCancel}>Cancel</button>
                        </form>
                    </div>
                )
            }
       </div>
    
    );
}
}

export default AddComponent;