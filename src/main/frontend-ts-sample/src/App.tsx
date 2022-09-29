import React from 'react';
import { Link, Route, Routes } from 'react-router-dom';
import NewsMain from './news/NewsMain';
import CafeMain from './cafe/CafeMain';
import Home from './pages/Home';
import About from './pages/About';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Routes>
            <Route path = "/news" element = {<NewsMain />}/>
            <Route path = "/cafe" element = {<CafeMain />}/>
            <Route path = "/" element={<Home />}/>
            <Route path = "/about" element={<About />}/>
        </Routes>
        {/* <div>
          <ul>
            <li><Link to="/news">news</Link></li>
            <li><Link to="/cafe">cafe</Link></li>
          </ul>
        </div> */}
      </header>
    </div>
  );
}

export default App;
