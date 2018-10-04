# zeoperative

A Clojure based toolbel for some tactical It operation routines.

## Usage

FIXME

## Scopes

## IAAS scope

* AWS
  * AWS sdk wrapping - to establish an handling convention around declared use cases, like:
    * add security group to `ec2` instances, in order to provision an access for scoped services.
      * For example:
        > * Any `ec2` instance must :
            * have `node-exporter` set up and runing
            * have an security group, that allow sampling of `node-exporter` data
    *

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
