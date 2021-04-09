import logo from './logo.svg';
import './App.css';
// import @CrossOrigin(origins = "*");

// import Labonecomponent from './components/Labonecomponent';
// import Lab3 from './components/Labthreecomponent';
// import EmployeeList from './components/Labtwocomponent';
import AdminListComponent from './components/AdminListComponent';
import ContractListComponent from './components/ContractListComponent';
import DefaultPropsComponent from './components/DefaultPropsComponent';
import Mounting1 from './components/ConstructorMethod';
import Mounting2 from './components/getDerivedStateFromPropsMethod';
import Mounting4 from './components/componentDidMountMethod';

function App() {
  return (
    <div>
      {/* <Labonecomponent/><br></br><br></br>
      <Lab3/><br></br><br></br>
      <EmployeeList/> */}
      <AdminListComponent/>
      <ContractListComponent/>
      <DefaultPropsComponent/>
      <Mounting1/>
      <Mounting2/>
      <Mounting4/>
    </div>
   
  );
}

export default App;