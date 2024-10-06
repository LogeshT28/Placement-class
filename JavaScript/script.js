// Create a new <li> element
const li = document.createElement('li');
li.textContent = 'This is a list item';

// Insert the <li> before the <p> tag
const pTag = document.getElementById('text');
pTag.insertAdjacentElement('beforebegin', li);

 