const express = require('express');
const app = express();

app.get('/', slowRoute);
app.get('/fast', fastRoute);

function slowRoute(req, res) {
  loop();
  allocate();
  setTimeout(() => res.send('Success'), 100);
}

function fastRoute(req, res) {
  res.send('Success'); 
}

function loop() {
  for (let i = 0; i <= 1e8; i++) {}
}

function allocate() {
  const items = [];

  for (let i = 0; i < 1e6; i++) {
	items.push({ count: i });
  }
}

app.listen(3030, 'localhost', () => console.log(`Listening on localhost:3030`));