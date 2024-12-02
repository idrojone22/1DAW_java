# Suma todas las líneas de los ficheros en el directorio actual y sus subdirectorios
$totalLines = 0

Get-ChildItem -File -Recurse | ForEach-Object {
    $lines = (Get-Content $_.FullName).Count
    $totalLines += $lines
}

Write-Output "Total de líneas en los archivos del directorio y subdirectorios: $totalLines"

