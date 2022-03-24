import logo from './logo.svg';
import './App.css';
import {lazy, Suspense} from 'react';

//import Slogan from './Slogan'; 
//import Rodape from './Rodape'; 


const Rodape = lazy(() => import('./Rodape'));
const Slogan = lazy(() => import('./Slogan'));

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        
          <Suspense fallback={ <p>Carregano 1 ... </p>}>
             <Slogan />
          </Suspense>

          <Suspense fallback={ <p>Carregano 2 ... </p>}>
               <Rodape />
          </Suspense>
         

      </header>
    </div>
  );
}

export default App;