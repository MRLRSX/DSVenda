import Home from 'components/Home';
import Dashboard from 'components/Dashboard';
import {BrowserRouter, Route ,Switch} from 'react-router-dom';

function Routes(){
    return(
      <BrowserRouter>
        <Switch>
            <Route path="/" exact>
                 <Home/>   
            </Route>
            <Route path="/dashboard" exact>
                 <Dashboard/>   
            </Route>
        </Switch>
      </BrowserRouter>
    );
}
export default Routes;