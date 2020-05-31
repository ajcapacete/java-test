#!/bin/bash

appname=$1
namespace=blit
javac com/$namespace/$appname/*.java && java com/$namespace/$appname/${appname^}App
