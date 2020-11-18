# systemd ready daemon sample written on Java
This simple daemon demonstrates how to handle stop signals from the systemd.

### How to build jar
`gradle jar`

### How to test
`java -jar build/libs/systemd-daemon-sample.jar`

### How to install
1. copy [sample-daemon.service](sample-daemon.service) file to the `/etc/systemd/system/` directory
1. run `sudo systemctl daemon-reload` to reload configuration
1. run `sudo systemctl start sample-daemon`

To see its status run `sudo systemctl status sample-daemon`

### I want to know more
Read [this](https://mincong.io/2018/07/03/create-systemd-unit-file-for-java/) article.

