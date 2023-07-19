//state
import React, {Component} from 'react'

class Message extends Component{
    constructor(){
        super()
        this.state={
            message:'Welcome visitor'
        }
    }
    changeMessage(){
        this.setState({
            message:'Thanku fr subscribing'

        })

    }
render() {
   return(
    <div>
    <h4>{this.state.message}</h4>
    <button onClick={() => this.changeMessage()}>Subscribe</button>
    </div>
   )
}
}

export default Message