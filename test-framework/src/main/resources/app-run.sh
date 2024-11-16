# vars
containerName="app-host"
imageName="calc-host"

# build an image
docker image build --tag ${imageName} "${PWD}/app/"

# start application host container
docker container run  --rm                      \
                      --detach                  \
                      --publish 8080:80         \
                      --name ${containerName}   \
                      ${imageName}

# get the environment variables
export APP_URL=http://localhost:8080/