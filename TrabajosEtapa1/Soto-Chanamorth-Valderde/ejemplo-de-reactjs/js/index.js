"use strict";

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

//import React from 'react'

var Contador = function (_React$Component) {
  _inherits(Contador, _React$Component);

  function Contador(props) {
    _classCallCheck(this, Contador);

    var _this = _possibleConstructorReturn(this, _React$Component.call(this, props));

    _this.state = {
      contador: 0
    };
    return _this;
  }

  Contador.prototype.aumentar = function aumentar() {
    this.setState({ contador: this.state.contador + 1 });
  };

  Contador.prototype.decrementar = function decrementar() {
    var contador = this.state.contador;
    if (contador > 0) {
      this.setState({ contador: contador - 1 });
    }
  };

  Contador.prototype.render = function render() {
    return React.createElement(
      "div",
      null,
      React.createElement(
        "h3",
        null,
        this.state.contador
      ),
      React.createElement("input", { type: "button", onClick: this.aumentar.bind(this), value: "Incrementar" }),
      React.createElement("input", { type: "button", onClick: this.decrementar.bind(this), value: "Decrementar" })
    );
  };

  return Contador;
}(React.Component);

React.render(React.createElement(Contador, null), document.getElementById("container"));