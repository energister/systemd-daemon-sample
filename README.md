# systemd ready daemon sample written on Java
This simple daemon demonstrates how to handle stop signals from the systemd.

More info can be found in [this](https://mincong.io/2018/07/03/create-systemd-unit-file-for-java/) article.

### How to build jar
`gradle jar`

### How to test
`java -jar build/libs/systemd-daemon-sample.jar`