# Logging

This task is to review the Capco [logging standards](https://ilabs-capco.atlassian.net/wiki/spaces/BPG/pages/411566109/Microservice+Logging) and to setup [Log4js](https://www.npmjs.com/package/log4js) logging to implement these standards. 

## Task

-   Implement log4js into your Node.js code and ensure that a log file is created in a specified folder
-   Ensure that the log includes details about your application, has UTC time format and that the individual Node.js method is output in the log.
-   Ensure that you can alter the log level and that INFO, WARN and ERROR messages are correctly output or omitted from the log file. Add INFO, WARN and ERROR logging to your existing code if required.

![](attachments/418807892/426803201.png?height=250)

## Extra Help - The following Git Repo proviodes examples of Log4js config and implmentation

<https://github.com/log4js-node/log4js-example>



## Code examples:

  const logger = log4js.getLogger('api.js');

  var dir = './logs/';
  if (!fs.existsSync(dir)){
      fs.mkdirSync(dir);
  }

  log4js.configure(
    {
      appenders: {
        file: {
          type: 'file',
          filename: './logs/nodeLogs.log',
          maxLogSize: 10 * 1024 * 1024, // = 10Mb
          backups: 5, // keep five backup files
          compress: true, // compress the backups
          encoding: 'utf-8',
          mode: 0o0640,
          flags: 'w+'
        },
        dateFile: {
          type: 'dateFile',
          filename: './logs/more-nodeLogs.log',
          pattern: 'yyyy-MM-dd-hh',
          compress: true
        },
        out: {
          type: 'stdout'
        }
      },
      categories: {
        default: { appenders: ['file', 'dateFile', 'out'], level: 'trace' }
      }
    }
  );

  logger.info(`${new Date().toJSON()}  connection successful`);
  logger.error(err);