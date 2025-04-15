document.getElementById('loginForm').addEventListener('submit', function(event) {
  event.preventDefault(); // Prevent the form from submitting

  const username = document.getElementById('username').value.trim();
  const password = document.getElementById('password').value.trim();
  const errorMessage = document.getElementById('error-message');

  if (!username || !password) {
    errorMessage.textContent = 'Please fill in both fields.';
    return;
  }

  if (username.length < 3 || username.length > 15) {
    errorMessage.textContent = 'Username must be between 3 and 15 characters.';
    return;
  }

  if (password.length < 6) {
    errorMessage.textContent = 'Password must be at least 6 characters long.';
    return;
  }

  // Clear the error message if validation passes
  errorMessage.textContent = '';
  alert('Login successful!');
});
