# API Documentation

This task is designed to automatically generate the API documentation for the application we created in [NodeJs Express App](nodejs_express_app.md). To do that, you will use a node package that utilises [Swagger](https://swagger.io/), now this process is slightly different to the Spring route in that we cannot use swagger directly, so we need to use an NPM package to provide the solution we require. This tool allows the automatic generation of your API documentation, which can be distributed to customers and also allows you to test your endpoints.

## Task

The following link may provide you with some useful information to get started: <https://medium.com/@sethigoldy/integrate-implementing-swagger-inline-api-documentation-with-node-js-express-server-83d9fa2a7afc>. The task is to add swaggerUI to your Node.js application. When complete, you should be able to browse to the [http://localhost:3000/swagger-ui.html](http://localhost:3000/swagger-ui.html)page and view the api documentation for your "GET /helloWorld" endpoint.


## Notes

Because swagger is not natively supported with Node.js applications, you may have to add some comments to the code in order for Swagger to pick this up and display it. These are in the following format:

  /**
   * This function comment is parsed by doctrine
   * @route GET /mongo
   * @param {string} {"name":"ENTER NAME HERE"}" - A json string param
   * @returns {String} 200 - Will connect to mongoDB
   * @returns {Error}  500 - Internal Server Error
   */

![](attachments/418676767/418873395.png?height=250)



