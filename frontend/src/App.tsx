import Navbar from "components/Navbar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import Barchart from "components/BarChart";
import Donutchart from "components/DonutChart";
function App() {
  return (
    <>
    <Navbar/>
    <div className="container">
      <h1 className="text-primary py-3">Bashboard de Vendas</h1>
      <div className="row px-3">
          <div className="col-sm-6">
          <h5 className="text-center text-secondary">Total de Venda</h5>
            <Barchart/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Total de Venda</h5>
            <Donutchart/>
          </div>
      </div>
      <div className="py-3">
        <h2 className="text-primary">Todas Vendas</h2>
      </div>
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
