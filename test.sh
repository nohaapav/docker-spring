#!/bin/bash

docker run --rm --net=dockerspring_default busybox wget -q -O- http://manager:8080/api/fetch
