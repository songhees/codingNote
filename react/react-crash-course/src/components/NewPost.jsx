import { useState } from 'react';
import Modal from './Modal';
import classes from './NewPost.module.css'
import { Link } from 'react-router-dom';

function NewPost(props) {
  const [enteredBody, setEnteredBody] = useState('');
  const [enteredAuthor, setEnteredAuthor] = useState('');
  function bodyChangeHandler(event) {
    setEnteredBody(event.target.value);
  }
  function authorChangeHandler(event) {
    setEnteredAuthor(event.target.value);
  }
  function submitHandler(event) {
    event.preventDefault();
    const postData = {
      body: enteredBody,
      author : enteredAuthor
    };
    props.onAddPost(postData);
  }
  return (
    <Modal>
      <form className={classes.form} onSubmit={submitHandler}>
        <p>
          <label htmlFor="body">Text</label>
          <textarea id="body" required rows={3} onChange={bodyChangeHandler}></textarea>
        </p>
        <p>
          <label htmlFor="name">Your name</label>
          <input type="text" id="name" required onChange={authorChangeHandler}/>
        </p>
        <p className={classes.actions}>
          <Link type="button" to="..">Cancel</Link>
          <button>Submit</button>
        </p>
      </form>
    </Modal>
  )
}

export default NewPost;