FROM ubuntu:15.04
mkdir References
COPY README.md References
CMD ["echo", "File Copied Successfully"]
