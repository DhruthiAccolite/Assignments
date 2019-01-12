import React,{Component} from 'react';
class AddDepartmentComponent extends Component{
    data={}
    state = {
        show: false
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
   
    add =(e) => {
        e.preventDefault();
        this.data["name"] && this.data["description"] && this.data["name"].length>0 && this.data["description"].length>0 && this.props.onDeptAdd(this.data);
        
    }
    render(){
        return(
        <div>
            <button  onClick={this.onClick}>Add Department</button>
            {
                this.state.show && 
                    <React.Fragment>
                        <form>
                            Department Name:<input type="text" id="name" size="20" onChange={this.handleChange} required/>
                            Department Description:<input type="text" id="description" onChange={this.handleChange}/>
            
                            <button onClick={this.add}>Add</button>
                            <button onClick={this.onCancel}>Cancel</button>
                        </form>
                    </React.Fragment>
                
            }
       </div>
    
    );
}
}

export default AddDepartmentComponent;