//props
import React from "react"

// function Greet(){
//     return <h1>Hello</h1>
// }
// const Greet = props => {
// console.log(props)
// return <h4>Name: {props.name} Definition: {props.content}</h4>
//     }

//Destructuring props=>2 methods
    // const Greet = ({name, content}) => {
    //     return <h4>Name: {name} Definition: {content}</h4>
            
    //     }

    const Greet = props => {
        const {name, content}=props
        return <h4>Name: {name} Definition: {content}</h4>
            
        }


export default Greet