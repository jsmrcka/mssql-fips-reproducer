# mssql-fips-reproducer

Run the reproducer by executing
```shell
mvn clean test
```
on a FIPS-enabled machine:
```shell
# check FIPS status
$ sysctl crypto.fips_enabled 
crypto.fips_enabled = 1

# enable FIPS (RHEL8)
$ sudo fips-mode-setup --enable
$ sudo reboot
```