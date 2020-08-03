Generate package.json without having it ask any questions:
npm init -y

Then we need to install Jest:
npm install --save-dev jest

Add support for babel:
npm install --save-dev babel-jest @babel/core @babel/preset-env

Create a babel preset file:
touch .babelrc

And add the current preset, to .babelrc:
{
  "presets": [
    "@babel/preset-env"
  ]
}


package.json
"scripts": {
  "test": "jest"
}

npm run test  // vai retorar erro por enquanto (No tests found...)