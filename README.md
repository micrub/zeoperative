# zeoperative

A Clojure based toolbel for some tactical It operation routines.

## Usage

FIXME

## Scopes

## IAAS scope

* UI
  * CLI ??
  * WEB ?
* AWS
  * AWS sdk wrapping - to establish an handling convention around declared use cases, like:
    * add security group to `ec2` instances, in order to provision an access for scoped services.
      * For example:
        > * Any `ec2` instance must :
            * have `node-exporter` set up and runing
            * have an security group, that allow sampling of `node-exporter` data on each required instance

## License

Copyright © 2018 MicrubCong

Distributed under the MIT License.
