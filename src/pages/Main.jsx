import { useState } from 'react';

function Main() {
  const [name, setName] = useState('');
  const [password, setPassword] = useState('');
  const [email, setEmail] = useState('');

  const handleName = (e) => setName(e.target.value);
  const handlePassword = (e) => setPassword(e.target.value);
  const handleEmail = (e) => setEmail(e.target.value);

  return (
    <div>
      <h2>회원가입 폼</h2>
      <label>이름: </label>
      <input type="text" value={name} onChange={handleName} />
      <br />
      <label>비밀번호: </label>
      <input type="password" value={password} onChange={handlePassword} />
      <br />
      <label>이메일: </label>
      <input type="email" value={email} onChange={handleEmail} />
      <br />
      <h4>name: {name}</h4>
      <h4>password: {password}</h4>
      <h4>email: {email}</h4>
    </div>
  );
}

export default Main;
