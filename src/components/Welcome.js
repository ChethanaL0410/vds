//Class component
import React, {Component} from 'react'

class Welcome extends Component{
render() {
   const {course, language}=this.props
   return <h4>Course: {course} Language: {language}</h4>
}
}

export default Welcome