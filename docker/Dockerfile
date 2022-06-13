FROM rust:latest
RUN apt-get update
RUN apt-get install -y make libsodium-dev libclang-dev pkg-config libssl-dev libxxhash-dev libzstd-dev clang

# install pijul
RUN cargo install pijul --version "~1.0.0-beta"
RUN export PATH="\$PATH:$HOME/.cargo/bin/"

RUN mkdir /development


# TODO:
# * [ ] test drive the pijul demo in the `development` directory