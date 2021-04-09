import React from 'react';
import axios from 'axios';
 
class AdminListComponent extends React.Component {
 
    constructor() {
        super();
        this.state = {
            adminList: []
        }
    }
    componentDidMount() {
        axios.get("http://localhost:8090/admins/getalladmins").then(response => {
            const admins = response.data;
            this.setState({
                adminList: admins
            });
        });
    }
    render() {
        return (
            <div>
                {
                    this.state.adminList !== undefined ?
                        this.state.adminList.map((admin, index) =>
                            <div>{admin.adminId} {admin.adminName} </div>)
                        : 
                         <h3>Loading....</h3>                        
                }
            </div>
        );
    }
}
 
export default AdminListComponent;