import React from 'react';
import axios from 'axios';
 
class ContractListComponent extends React.Component {
 
    constructor() {
        super();
        this.state = {
            contractList: []
        }
    }
    componentDidMount() {
        axios.get("http://localhost:8090/contracts/getallContracts").then(response => {
            const contracts = response.data;
            this.setState({
                contractList: contracts
            });
        });
    }
    render() {
        return (
            <div>
                {
                    this.state.contractList !== undefined ?
                        this.state.contractList.map((contract, index) =>
                            <div>{contract.contractNumber} {contract.deliveryPlace} {contract.delivaryDate} {contract.quantity} {contract.scheduler} {contract.customer} </div>)
                        : 
                         <h3>Loading....</h3>                        
                }
            </div>
        );
    }
}
 
export default ContractListComponent;